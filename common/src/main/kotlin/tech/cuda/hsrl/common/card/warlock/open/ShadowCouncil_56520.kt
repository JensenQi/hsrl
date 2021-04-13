package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowCouncil_56520 : Card() {
    override val id = 56520
    override val name = "暗影议会"
    override val description = "随机将你的手牌替换成恶魔牌，并使它们获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "为什么外域的人都喜欢换手？！"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbafdb4889052018c7913bb509b5ccbd8a1c839491ec69bec428dfdd45f35717.png"
}
