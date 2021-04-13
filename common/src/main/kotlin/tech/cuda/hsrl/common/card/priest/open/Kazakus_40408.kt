package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kazakus_40408 : Card() {
    override val id = 40408
    override val name = "卡扎库斯"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则为你创建一个自定义 法术。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "暗金教在此严正声明，卡扎库斯教主并非巨龙，也从未染指过违禁药水。任何公开污蔑暗金教或卡扎库斯教主本人的言论，必将遭受法律和龙息药水的严惩！"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88c9e7452e1734f874096e7ee2c9886ea9ed2c69e5602410095ef16e23ab85e0.png"
}
