package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowSensei_40695 : Card() {
    override val id = 40695
    override val name = "暗影大师"
    override val description = "<b>战吼：</b>使一个<b>潜行</b>的随从获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "他曾是艾雅的导师。但他多次指出艾雅的问题，结果被炒了鱿鱼。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/90cf3fe6bf6e962bcef4a6dbde2efc389d25994b3174242266c32a232903246f.png"
}
