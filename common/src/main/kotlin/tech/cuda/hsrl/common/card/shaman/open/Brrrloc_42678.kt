package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brrrloc_42678 : Card() {
    override val id = 42678
    override val name = "冷冻鱼人"
    override val description = "<b>战吼：</b> <b>冻结</b>一个敌人。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "因其自带保鲜功能，畅销艾泽拉斯的各个角落！"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34a31e17c1f97d2501d74971a79e27f305f6dfdd3b2de53533f12697d480ff37.png"
}
