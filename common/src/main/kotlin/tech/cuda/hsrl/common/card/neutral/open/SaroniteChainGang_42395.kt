package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SaroniteChainGang_42395 : Card() {
    override val id = 42395
    override val name = "萨隆苦囚"
    override val description = "<b>嘲讽</b> <b>战吼：</b>召唤一个该随从的复制。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "其实他更想一个人呆着。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d562bc767c377c861759e9bfaa7d3dbd09853c369f163476835632c324bff3f3.png"
}
