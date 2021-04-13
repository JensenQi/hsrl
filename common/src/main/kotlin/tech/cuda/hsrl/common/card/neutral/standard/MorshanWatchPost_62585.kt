package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MorshanWatchPost_62585 : Card() {
    override val id = 62585
    override val name = "莫尔杉哨所"
    override val description = "无法攻击。在你的对手使用一张随从牌后，召唤一个2/2的 步兵。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "自从部落推进到了灰谷，这座哨所的存在感低了不少。"
    override val artist = "Forrest Imel"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7532e84d6d487a283dad5a49b4cd9657d80ed010166e3795c4113d9f61a3f05d.png"
}
