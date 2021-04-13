package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CloakOfShadows_61154 : Card() {
    override val id = 61154
    override val name = "暗影斗篷"
    override val description = "使你的英雄获得<b>潜行</b>一回合。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "只有聪明的皇帝能看到这件斗篷。"
    override val artist = "Cheng Hao"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae19a0214c4f945df3b20b4d480c4cfdd263e44a2b72d87b06c12d43f86b1387.png"
}
