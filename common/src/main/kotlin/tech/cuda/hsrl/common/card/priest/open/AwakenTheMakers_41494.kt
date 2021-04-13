package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AwakenTheMakers_41494 : Card() {
    override val id = 41494
    override val name = "唤醒造物者"
    override val description = "<b>任务：</b>召唤7个具有<b>亡语</b>的随从。 <b>奖励：</b>希望守护者阿玛拉。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "他们唤醒造物者的方法就是不停地按门铃。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2e8baa71a3e0aa7ca2b8aa90a201337e3d86d30ab3ba6712c16deeeb3f9919c6.png"
}
