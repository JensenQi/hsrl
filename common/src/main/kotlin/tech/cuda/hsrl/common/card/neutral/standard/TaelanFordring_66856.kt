package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TaelanFordring_66856 : Card() {
    override val id = 66856
    override val name = "泰兰·弗丁"
    override val description = "<b>嘲讽</b>，<b>圣盾</b> <b>亡语：</b>抽取你的法力值消耗最高的 随从牌。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "泰兰和血色十字军一同度过了人生中的多数时光，最终发现，这伙人也许算不上好人。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d51015b7269b2bdd122438f85361ffc8f8896ea4d9b0e431a5ac62a4352245c1.png"
}
