package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArmoredWarhorse_2627 : Card() {
    override val id = 2627
    override val name = "重甲战马"
    override val description = "<b>战吼：</b>揭示双方牌库里的一张随从牌。如果你的牌法力值消耗较大，则获得<b>冲锋</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "骑着重甲战马去打仗，别提有多威风了。"
    override val artist = "Edouard Guiton & Tony Washington"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88d698363895076e62a73f42b80b6088495ca7ac56381fa8fc200569d65e7805.png"
}
