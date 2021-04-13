package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GormokTheImpaler_2724 : Card() {
    override val id = 2724
    override val name = "穿刺者戈莫克"
    override val description = "<b>战吼：</b>如果你拥有至少四个其他随从，则造成4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "戈莫克在赛场外搭了个帐篷，专门教授刺枪技巧。想在本次大赛上拿个好名次吗？只要998（只收金币）！"
    override val artist = "Nutthapon Petchthai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf1edb78d3d53904f99e842a1189a2f37beffb70354ef33bce7199fbfa96bd96.png"
}
