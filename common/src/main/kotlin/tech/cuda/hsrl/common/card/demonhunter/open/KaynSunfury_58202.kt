package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KaynSunfury_58202 : Card() {
    override val id = 58202
    override val name = "凯恩·日怒"
    override val description = "<b>冲锋</b> 所有友方攻击无视 <b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“护甲与治疗或许能暂缓我的狂热，但邪能和战刃总能鞭策着我！”"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e017565f065afee80aeaafd3d2d6bbad93d5e35f314058d4218d154f0d45bcdb.png"
}
