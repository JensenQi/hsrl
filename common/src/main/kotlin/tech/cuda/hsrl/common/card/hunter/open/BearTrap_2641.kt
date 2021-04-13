package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BearTrap_2641 : Card() {
    override val id = 2641
    override val name = "捕熊陷阱"
    override val description = "<b>奥秘：</b>在你的英雄受到攻击后，召唤一个3/3并具有<b>嘲讽</b>的灰熊。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "得多大尺寸的陷阱才能捕住一头熊，只有熊知道。"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c982e7e24003466ea7d97260f824f76e63d83fd67b797b73f7d0478adbdaaab6.png"
}
