package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KragwaTheFrog_50369 : Card() {
    override val id = 50369
    override val name = "卡格瓦，青蛙之神"
    override val description = "<b>战吼：</b>将你上回合使用的所有法术牌移回你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "卡格瓦纪念朋友和吞噬敌人的方式是一样的，吃到肚里没人分得清。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c107a1c919db6d8c21d4c533b4b5ad5afccf51e93ce05e544a9de18aecd8df7.png"
}
