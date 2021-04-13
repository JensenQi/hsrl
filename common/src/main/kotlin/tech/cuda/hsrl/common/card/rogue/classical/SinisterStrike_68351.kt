package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SinisterStrike_68351 : Card() {
    override val id = 68351
    override val name = "影袭"
    override val description = "对敌方英雄造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "尽管这个技能的名字已被改变，但这并不意味着它就不再“邪恶”。"
    override val artist = "Frank Cho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f22386de404b90b3edbfb190a0c62bf414ca34c6307e61afe4507de00580c77f.png"
}
