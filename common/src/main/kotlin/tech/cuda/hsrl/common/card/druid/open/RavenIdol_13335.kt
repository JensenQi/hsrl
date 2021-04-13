package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavenIdol_13335 : Card() {
    override val id = 13335
    override val name = "乌鸦神像"
    override val description = "<b>抉择：</b> <b>发现</b>一张随从牌；或者<b>发现</b>一张法术牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Loe
    override val background = "乌鸦通常代表着不祥之兆，竟然还有人对其顶礼膜拜……"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8bb452ccd0207b504c4deceed52abe3e8df36c7bad7351f222691b53cfa6a35e.png"
}
