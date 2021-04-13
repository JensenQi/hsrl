package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForbiddenAncient_38340 : Card() {
    override val id = 38340
    override val name = "禁忌古树"
    override val description = "<b>战吼：</b>消耗你所有的法力值，每消耗一点法力值，便获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "禁忌古树在自己的套牌里放满了砰砰博士，因此旅店里没人愿意跟它玩。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2174ac9434dd68161284a6a473bf2f2d197ca2d16dd829e3e9e3724a34a1c4da.png"
}
