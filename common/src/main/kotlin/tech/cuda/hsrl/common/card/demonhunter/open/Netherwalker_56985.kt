package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Netherwalker_56985 : Card() {
    override val id = 56985
    override val name = "虚无行者"
    override val description = "<b>战吼：</b> <b>发现</b>一张恶魔牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "在学会虚空行走之前，先给我爬。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f3ba3c8fee419e2c77d9032f53b1376daaf21670aa6101e69be90426b141861.png"
}
