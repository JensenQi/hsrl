package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Corruption_982 : Card() {
    override val id = 982
    override val name = "腐蚀术"
    override val description = "选择一个敌方随从，在你的回合开始时，消灭该随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "心灵的腐蚀来自于最初的一些小偷小摸，而在你意识到它之前...嘭！一切化为乌有！"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78d1d56def399386f139c31a16e895c66e361bed1cc8b65d38e8541e5d4b13ea.png"
}
