package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterOakheart_46449 : Card() {
    override val id = 46449
    override val name = "欧克哈特大师"
    override val description = "<b>战吼：</b> <b>招募</b>攻击力为1，2，3的随从各一个。"
    override var cost: Int? = 9
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他的冒险小队成员包括：闪金镇步兵、霜狼步兵、哈多诺克斯。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1266d7d4030442b79e3116e4d9a9f8422d445dce62ca680d503bd7918dae28b.png"
}
