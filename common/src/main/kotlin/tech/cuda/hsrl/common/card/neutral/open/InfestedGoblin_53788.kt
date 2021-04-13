package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InfestedGoblin_53788 : Card() {
    override val id = 53788
    override val name = "招虫的地精"
    override val description = "<b>嘲讽，亡语：</b>将两张1/1并具有<b>嘲讽</b>的“甲虫”置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "听我的，千万别在除虫喷雾上省钱。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b7f6477e6bae9e28952253555d52d85589c531f1332398dfbbf74b7f68160f8.png"
}
