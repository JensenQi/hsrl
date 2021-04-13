package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrightenedFlunky_54274 : Card() {
    override val id = 54274
    override val name = "惊恐的仆从"
    override val description = "<b>嘲讽，战吼：</b> <b>发现</b>一张具有<b>嘲讽</b>的随从牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“硕铠鼠……你在哪啊？！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/016b19a899e0a3dd970aa463d045b2a7f7bb7c9be7bf0acc77c47d0cbbfe648c.png"
}
