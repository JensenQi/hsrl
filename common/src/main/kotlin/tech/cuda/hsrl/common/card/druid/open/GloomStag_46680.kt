package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GloomStag_46680 : Card() {
    override val id = 46680
    override val name = "阴郁的牡鹿"
    override val description = "<b>嘲讽，战吼：</b>如果你的牌库中只有法力值消耗为奇数的牌，则获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy4
    override val background = "威严、雄壮、超凡优雅的它……却总显得很抑郁。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/151ebc72dac24694b3a473bdb74f26c0ba3a514fbdb47691c0ac0f6362331396.png"
}
