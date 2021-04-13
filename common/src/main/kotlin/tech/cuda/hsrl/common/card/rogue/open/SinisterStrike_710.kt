package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SinisterStrike_710 : Card() {
    override val id = 710
    override val name = "影袭"
    override val description = "对敌方英雄造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "尽管这个技能的名字已被改变，但这并不意味着它就不再“邪恶”。"
    override val artist = "Frank Cho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75b35db7325ff776e9f60c1d8f1b6bded49be10d4893c30de506ecca0ae6b88e.png"
}
