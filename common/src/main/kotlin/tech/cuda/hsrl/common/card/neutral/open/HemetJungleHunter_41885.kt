package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HemetJungleHunter_41885 : Card() {
    override val id = 41885
    override val name = "“丛林猎人”赫米特"
    override val description = "<b>战吼：</b> 摧毁你牌库中所有法力值消耗小于或等于（3）点的卡牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "虽然地精旅行社弄丢了他的行李，不过赫米特在安戈洛还是度过了一个美好的假期！"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5ad292a549d283c4ff4e24845a759a15ba22fd476378f3f321a5b23bcc4b121.png"
}
