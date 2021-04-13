package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BreathOfSindragosa_43502 : Card() {
    override val id = 43502
    override val name = "冰龙吐息"
    override val description = "随机对一个敌方随从造成 2点伤害，并使其<b>冻结</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "是这里本来就冷，还是因为辛达苟萨？"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4cb59d52c95c7acacdd830ae8edc541eb881153ced238d21a13890c1fa0e4dc4.png"
}
