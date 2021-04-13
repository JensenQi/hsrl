package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WeaponizedPiata_48518 : Card() {
    override val id = 48518
    override val name = "武装皮纳塔"
    override val description = "<b>亡语：</b> 随机将一张<b>传说</b>随从牌置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "没关系，去砸吧。它们不会生气的。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ad963c64635474198b40778fada7d1d5be7841f6bd8e98fb0da837964298efd.png"
}
