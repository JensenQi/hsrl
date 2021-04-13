package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BrittleboneDestroyer_59222 : Card() {
    override val id = 59222
    override val name = "脆骨破坏者"
    override val description = "<b>战吼：</b>在本回合中，如果你的英雄的生命值发生变化，消灭一个随从。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "再要十斤寸金软骨，细细地剁做臊子，不要见些肉在上面！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83daba81e9b9a1cf74ef2c147fb1fad3df3aefc56c1ce56360755928f9a714c1.png"
}
