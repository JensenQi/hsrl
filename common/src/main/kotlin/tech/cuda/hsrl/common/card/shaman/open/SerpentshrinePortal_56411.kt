package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SerpentshrinePortal_56411 : Card() {
    override val id = 56411
    override val name = "毒蛇神殿传送门"
    override val description = "造成 3点伤害。随机召唤一个法力值消耗为（3）的随从。<b>过载：</b>（1）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "外域下水道的雅称。"
    override val artist = "Gustav Schmidt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3aa038ade0b88af5b59ae9df4c00ea629c9b6a65ef8cc77e06b48a20400788cd.png"
}
