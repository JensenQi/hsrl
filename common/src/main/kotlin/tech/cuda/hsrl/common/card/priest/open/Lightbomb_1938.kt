package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightbomb_1938 : Card() {
    override val id = 1938
    override val name = "圣光炸弹"
    override val description = "对所有随从造成等同于其攻击力的伤害。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "既然你们愿意让一个地精成为牧师，就准备好接受这样的后果吧。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b90ec231e5a5f138afccf99978f20c2a756ab13fb06336d4976262185300479.png"
}
