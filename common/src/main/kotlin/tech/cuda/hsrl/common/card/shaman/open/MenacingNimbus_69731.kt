package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MenacingNimbus_69731 : Card() {
    override val id = 69731
    override val name = "凶恶的雨云"
    override val description = "<b>战吼：</b>随机将一张元素牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "伊莱克特拉把她的元素藏在了云端里。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7067a7f83b0b9d12de2174c91f7251616328233b7e983da1661f4d5e331471d.png"
}
