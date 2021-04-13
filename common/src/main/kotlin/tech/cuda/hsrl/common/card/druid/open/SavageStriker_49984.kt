package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavageStriker_49984 : Card() {
    override val id = 49984
    override val name = "野蛮先锋"
    override val description = "<b>战吼：</b>对一个敌方随从造成等同于你的英雄攻击力的伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "部族聚餐时尤其野蛮。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2caaf57dcac030689e8d4adb92007e8aa9b7d969382ff79e6dc7fc77d72fe451.png"
}
