package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YseraUnleashed_55030 : Card() {
    override val id = 55030
    override val name = "觉醒巨龙伊瑟拉"
    override val description = "<b>战吼：</b>将七张“梦境之门”洗入你的牌库。当抽到梦境之门时，随机召唤一条龙。"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "把龙放出来！"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bad65ad9c933aaf5e8cf0211004de12b20fb21085642a32d859f7125771a2598.png"
}
