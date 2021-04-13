package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Squallhunter_54956 : Card() {
    override val id = 54956
    override val name = "猎风巨龙"
    override val description = "<b>法术伤害+2</b> <b>过载：</b>（2）"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "窗外天气多可怕……猎风巨龙乐开花！我们走过这条小路——过载啦！过载啦！"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78c179142406659b616de5fa1f22e4985e01ac7d084d962697760b8328177ad9.png"
}
