package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MusterForBattle_2029 : Card() {
    override val id = 2029
    override val name = "作战动员"
    override val description = "召唤三个1/1的白银之手新兵，装备一把1/4的武器。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "请不要辜负这些新兵的一腔热血，还有这把锤子。"
    override val artist = "Mike Hayes"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e374f7f6f27a4701836457f63278042c432318a927c3b2901d187437366a34da.png"
}
