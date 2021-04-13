package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladeOfCthun_38861 : Card() {
    override val id = 38861
    override val name = "克苏恩之刃"
    override val description = "<b>战吼：</b>消灭一个随从。你的克苏恩会获得其攻击力和生命值<i>（无论它在哪里）。</i>"
    override var cost: Int? = 9
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "克苏恩要求献上祭品，选谁好呢……死亡之翼不错！"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd978000d825ee05340c1a3ad5740541b7deefedb786c2442c35c523127e7866.png"
}
