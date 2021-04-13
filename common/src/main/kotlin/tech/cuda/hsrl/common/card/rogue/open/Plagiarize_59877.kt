package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Plagiarize_59877 : Card() {
    override val id = 59877
    override val name = "抄袭"
    override val description = "<b>奥秘：</b>在你对手的回合结束时，将其使用的卡牌的复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "所谓抄袭，不过是“合理”地利用了你的资源。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/27e793cafb86b63adac1a99c332821393a934fc37287fd9ecbd2f5997920b2d5.png"
}
