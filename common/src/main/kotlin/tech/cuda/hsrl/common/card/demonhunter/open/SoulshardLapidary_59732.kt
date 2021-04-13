package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulshardLapidary_59732 : Card() {
    override val id = 59732
    override val name = "铸魂宝石匠"
    override val description = "<b>战吼：</b>摧毁一张你牌库中的灵魂残片，在本回合中使你的英雄获得+5攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "宝石匠点燃了一张残片。残片发出强烈的光，她的英雄从没有像现在这样高大。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/997b464d554028e95061c811c02c07b1cde33e944a590cfaa4bf9f41bd030e8b.png"
}
