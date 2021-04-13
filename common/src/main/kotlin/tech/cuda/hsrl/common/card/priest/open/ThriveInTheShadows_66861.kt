package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThriveInTheShadows_66861 : Card() {
    override val id = 66861
    override val name = "暗中生长"
    override val description = "从你的牌库中<b>发现</b>一张法术牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "你的法术牌为什么要惧怕黑暗？暗一点才容易睡着。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6831171d23efc0d13927435cd320a7e7c0ccc843f7da2fa7e0ccc6f3cc8d53a5.png"
}
