package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwinEmperorVeklor_38488 : Card() {
    override val id = 38488
    override val name = "维克洛尔大帝"
    override val description = "<b><b>嘲讽</b>，战吼：</b>如果你的克苏恩至少具有10点攻击力，则召唤另一名双子皇帝。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "我比你大两分钟，所以听我的！快，给我放火烧了那座村子！"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/425a82a9e39ae62b3e9d7c488992ddd92c048e484bf9204b622ef468f07a49f6.png"
}
