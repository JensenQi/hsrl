package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JinyuWaterspeaker_40285 : Card() {
    override val id = 40285
    override val name = "锦鱼人水语者"
    override val description = "<b>战吼：</b>恢复 6点生命值。<b>过载：</b>（1）"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "玉莲帮正是看中了水语者预见未来的能力，才派他们潜伏在加基森的股票交易所。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/40cd68b6ff03d7169b16f94a4a075712920e64babde9826221ff14dcf0ba2f3c.png"
}
