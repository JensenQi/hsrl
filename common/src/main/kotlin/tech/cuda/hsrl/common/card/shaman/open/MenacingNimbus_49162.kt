package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MenacingNimbus_49162 : Card() {
    override val id = 49162
    override val name = "凶恶的雨云"
    override val description = "<b>战吼：</b>随机将一张元素牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "伊莱克特拉把她的元素藏在了云端里。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a334fb7aa67e2b12d3e122b76b69da08104efbd84036350016a9a4e8695859ac.png"
}
