package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SaroniteTaskmaster_50796 : Card() {
    override val id = 50796
    override val name = "萨隆铁矿监工"
    override val description = "<b>亡语：</b>为你的对手召唤一个0/3并具有<b>嘲讽</b>的自由的矿工。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "不要妄想放风的机会。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78e0ad733df3e6a6d4e3574c58371c3b676a2c782cb129a23db6760d12e1d6f3.png"
}
