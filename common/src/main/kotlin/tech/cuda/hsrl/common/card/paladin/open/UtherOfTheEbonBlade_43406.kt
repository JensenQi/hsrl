package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UtherOfTheEbonBlade_43406 : Card() {
    override val id = 43406
    override val name = "黑锋骑士乌瑟尔"
    override val description = "<b>战吼：</b> 装备一把5/3并具有<b>吸血</b>的武器。"
    override var cost: Int? = 9
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "“过来，忏悔！曾经的我只是圣光的仆人。但现在，我将独自审判你。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/368ccce54117bfab2d96bf9a5e389803ccf06d79b7d05fe1397aee1f813bc380.png"
}
