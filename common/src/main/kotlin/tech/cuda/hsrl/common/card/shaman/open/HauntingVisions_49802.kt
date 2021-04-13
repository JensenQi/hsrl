package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HauntingVisions_49802 : Card() {
    override val id = 49802
    override val name = "亡鬼幻象"
    override val description = "在本回合中，你所施放的下一个法术的法力值消耗减少（3）点。<b>发现</b>一张法术牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "做梦遇见鬼不可怕，可怕的是醒来真见鬼了。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/601c43064294d6e887ceee4a65dbee6881d0793a4f1e87a80c97929385869b43.png"
}
