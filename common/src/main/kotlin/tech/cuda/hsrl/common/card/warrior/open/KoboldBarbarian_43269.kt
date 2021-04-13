package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldBarbarian_43269 : Card() {
    override val id = 43269
    override val name = "狗头人蛮兵"
    override val description = "在你的回合开始时，随机攻击一名敌人。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "人生中最美好的事情是什么？制造蜡烛，保护蜡烛，还有聆听那些偷蜡烛贼的临终哀号。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbebe19d016bd5e874fd223448dd8d6d33a9237f59630e0e4431be9f1d524607.png"
}
