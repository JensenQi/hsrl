package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Corruption_68344 : Card() {
    override val id = 68344
    override val name = "腐蚀"
    override val description = "选择一个敌方随从，在你的回合开始时，消灭该随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "心灵的腐蚀来自于最初的一些小偷小摸，而在你意识到它之前...嘭！一切化为乌有！"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a142c39221f4be68ac56c120223259328f78e74f8f13fa8ebe5b3af6750454d.png"
}
