package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazorpetalLasher_41208 : Card() {
    override val id = 41208
    override val name = "刀瓣鞭笞者"
    override val description = "<b>战吼：</b>将一张可造成1点伤害的“刀瓣”置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "难怪安戈洛没有僵尸。"
    override val artist = "Sojin Hwang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/abd1c5e393de46ca3a340ae8aa33253337dbe8202e664c2db68a469ebe7ce066.png"
}
