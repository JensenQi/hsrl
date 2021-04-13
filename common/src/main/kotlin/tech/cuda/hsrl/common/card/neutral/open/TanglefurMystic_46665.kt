package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TanglefurMystic_46665 : Card() {
    override val id = 46665
    override val name = "杂毛秘术师"
    override val description = "<b>战吼：</b> 随机将一张法力值消耗为（2）的随从牌置入每个玩家的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "哈哈，你要倒大霉啦！不过只要价钱合适，我能帮你大事化小，逢凶化吉。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ef737f12049944251167415a24b01cd14b5ab36cd1f56af3f996d579e0c8408.png"
}
