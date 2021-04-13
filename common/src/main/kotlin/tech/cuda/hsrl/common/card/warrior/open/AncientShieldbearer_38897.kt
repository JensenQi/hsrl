package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientShieldbearer_38897 : Card() {
    override val id = 38897
    override val name = "上古之神护卫"
    override val description = "<b>战吼：</b> 如果你的克苏恩至少具有10点攻击力，则获得10点护甲值。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "在过去，她一个胳膊就能举起4面2吨重的盾牌，所以现在这点份量根本不在话下！"
    override val artist = "Alex Konstad"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a3367432ef1318b0e3e25a176b0004cd383e33240cb4dca19ce3db9d4596fa11.png"
}
