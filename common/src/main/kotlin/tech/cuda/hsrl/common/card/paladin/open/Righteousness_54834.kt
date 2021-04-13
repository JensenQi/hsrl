package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Righteousness_54834 : Card() {
    override val id = 54834
    override val name = "正义"
    override val description = "使你的所有随从获得<b>圣盾</b>。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "就像披了件毛茸茸的毯子，倍感温暖与正义！"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7ef805164353d9b62d8e669314ead81d254db5c5155a3bfbfe3fa31bba7141e.png"
}
