package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthenScales_41081 : Card() {
    override val id = 41081
    override val name = "大地之鳞"
    override val description = "使一个友方随从获得+1/+1，然后获得等同于其攻击力的 护甲值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "其实你也可以拥有大地之鳞。第一步：在泥地里打滚；第二步：等自然风干。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e32bfa17910243048837ff75d014c42e7fb57d13fbe9ae4423a88c51ca3982e.png"
}
