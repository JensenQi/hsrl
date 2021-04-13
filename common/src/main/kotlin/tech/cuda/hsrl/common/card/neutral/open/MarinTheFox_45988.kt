package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarinTheFox_45988 : Card() {
    override val id = 45988
    override val name = "“老狐狸”马林"
    override val description = "<b>战吼：</b>为你的对手召唤一个0/8的宝箱。<i>（打破宝箱可以获得惊人的战利品！）</i>"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "我是“老狐狸”马林。你抢了我的财宝！准备受死吧！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7053b66a1ff5a04792f82aea89d355fbae755c30c3629a1bc0e0acc9dde37f3a.png"
}
