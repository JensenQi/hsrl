package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DiscipleOfCthun_38547 : Card() {
    override val id = 38547
    override val name = "克苏恩的信徒"
    override val description = "<b>战吼：</b> 造成2点伤害。使你的克苏恩获得+2/+2<i>（无论它在哪里）。</i>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "只要加入教派，就可以享受免费的下午茶。这也是克苏恩为什么这么受欢迎的原因。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8174324f715c4e3b49ef75a3de296cc5af9cafd1ab926bc173064e7d1a33d541.png"
}
