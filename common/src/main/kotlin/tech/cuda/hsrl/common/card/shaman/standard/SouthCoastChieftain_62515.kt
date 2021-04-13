package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthCoastChieftain_62515 : Card() {
    override val id = 62515
    override val name = "南海岸酋长"
    override val description = "<b>战吼：</b>如果你控制另一个鱼人，则造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "它找到了海螺，现在你来教它说话吧！"
    override val artist = "Kagi "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2ed8ed83903a8f7d74bdde46dc2f5cd203e0c6d98bdc57ee9d9963b3f775950.png"
}
